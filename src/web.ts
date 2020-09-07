import { WebPlugin } from '@capacitor/core';
import { SimpleReferrerPlugin } from './definitions';

export class SimpleReferrerWeb extends WebPlugin implements SimpleReferrerPlugin {
  constructor() {
    super({
      name: 'SimpleReferrer',
      platforms: ['web'],
    });
  }
}

const SimpleReferrer = new SimpleReferrerWeb();

export { SimpleReferrer };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(SimpleReferrer);
